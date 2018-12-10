package com.gwidgets.api.leaflet;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface Decode {
	
	void onDecode(String decoded);
}
