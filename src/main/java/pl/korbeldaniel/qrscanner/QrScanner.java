package pl.korbeldaniel.qrscanner;

import jsinterop.annotations.JsType;
import elemental2.dom.Element;
import jsinterop.annotations.JsPackage;

@JsType(namespace=JsPackage.GLOBAL, isNative=true)
public class QrScanner {
    public QrScanner(Element element, Decode onDecode, String widthAndHight) {};
	//public QrScanner(Element elementById, Object onDecode) {}
    public native void start();
	public native void stop();
}
