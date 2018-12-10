package pl.korbeldaniel.qrscanner;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface Decode {

	void onDecode(String decoded);
}
