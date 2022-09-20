var VanillaTilt = function() {
	"use strict";
	class t {
		constructor(t, e = {}) {
			if (!(t instanceof Node)) throw "Can't initialize VanillaTilt because " + t + " is not a Node.";
			this.width = null, this.height = null, this.left = null, this.top = null, this.transitionTimeout = null, this.updateCall = null, this.updateBind = this.update.bind(this), this.element = t, this.settings = this.extendSettings(e), this.reverse = this.settings.reverse ? -1 : 1, this.addEventListeners()
		}
		addEventListeners() {
			this.onMouseEnterBind = this.onMouseEnter.bind(this), this.onMouseMoveBind = this.onMouseMove.bind(this), this.onMouseLeaveBind = this.onMouseLeave.bind(this), this.element.addEventListener("mouseenter", this.onMouseEnterBind), this.element.addEventListener("mousemove", this.onMouseMoveBind), this.element.addEventListener("mouseleave", this.onMouseLeaveBind)
		}
		removeEventListeners() {
			this.element.removeEventListener("mouseenter", this.onMouseEnterBind), this.element.removeEventListener("mousemove", this.onMouseMoveBind), this.element.removeEventListener("mouseleave", this.onMouseLeaveBind)
		}
		destroy() {
			this.removeEventListeners(), this.element.vanillaTilt = null, delete this.element.vanillaTilt, this.element = null
		}
		onMouseEnter(t) {
			this.updateElementPosition(), this.element.style.willChange = "transform", this.setTransition()
		}
		onMouseMove(t) {
			null !== this.updateCall && cancelAnimationFrame(this.updateCall), this.event = t, this.updateCall = requestAnimationFrame(this.updateBind)
		}
		onMouseLeave(t) {
			this.setTransition(), this.settings.reset && this.reset()
		}
		reset() {
			requestAnimationFrame(() => {
				this.event = {
					pageX: this.left + this.width / 2,
					pageY: this.top + this.height / 2
				}, this.element.style.transform = "perspective(" + this.settings.perspective + "px) rotateX(0deg) rotateY(0deg) scale3d(1, 1, 1)"
			})
		}
		getValues() {
			let t = (this.event.clientX - this.left) / this.width,
				e = (this.event.clientY - this.top) / this.height;
			t = Math.min(Math.max(t, 0), 1), e = Math.min(Math.max(e, 0), 1);
			let i = (this.reverse * (this.settings.max / 2 - t * this.settings.max)).toFixed(2),
				s = (this.reverse * (e * this.settings.max - this.settings.max / 2)).toFixed(2);
			return {
				tiltX: i,
				tiltY: s,
				percentageX: 100 * t,
				percentageY: 100 * e
			}
		}
		updateElementPosition() {
			let t = this.element.getBoundingClientRect();
			this.width = this.element.offsetWidth, this.height = this.element.offsetHeight, this.left = t.left, this.top = t.top
		}
		update() {
			let t = this.getValues();
			this.element.style.transform = "perspective(" + this.settings.perspective + "px) rotateX(" + ("x" === this.settings.axis ? 0 : t.tiltY) + "deg) rotateY(" + ("y" === this.settings.axis ? 0 : t.tiltX) + "deg) scale3d(" + this.settings.scale + ", " + this.settings.scale + ", " + this.settings.scale + ")", this.element.dispatchEvent(new CustomEvent("tiltChange", {
				detail: t
			})), this.updateCall = null
		}
		setTransition() {
			clearTimeout(this.transitionTimeout), this.element.style.transition = this.settings.speed + "ms " + this.settings.easing, this.transitionTimeout = setTimeout(() => this.element.style.transition = "", this.settings.speed)
		}
		extendSettings(t) {
			let e = {
					reverse: !1,
					max: 35,
					perspective: 1e3,
					easing: "cubic-bezier(.03,.98,.52,.99)",
					scale: "1",
					speed: "300",
					transition: !0,
					axis: null,
					reset: !0
				},
				i = {};
			for (var s in e)
				if (s in t) i[s] = t[s];
				else if (this.element.hasAttribute("data-tilt-" + s)) {
				let t = this.element.getAttribute("data-tilt-" + s);
				try {
					i[s] = JSON.parse(t)
				} catch (e) {
					i[s] = t
				}
			} else i[s] = e[s];
			return i
		}
		static init(e, i) {
			e instanceof Node && (e = [e]), e instanceof NodeList && (e = [].slice.call(e)), e instanceof Array && e.forEach(e => {
				"vanillaTilt" in e || (e.vanillaTilt = new t(e, i))
			})
		}
	}
	return "undefined" != typeof document && (window.VanillaTilt = t, t.init(document.querySelectorAll("[data-tilt]"))), t
}();