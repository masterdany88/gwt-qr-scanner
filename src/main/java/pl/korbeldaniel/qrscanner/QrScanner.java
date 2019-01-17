package pl.korbeldaniel.qrscanner;

import jsinterop.annotations.JsType;
import elemental2.dom.Element;
import jsinterop.annotations.JsPackage;

@JsType(namespace=JsPackage.GLOBAL, isNative=true)
public class QrScanner {
	private boolean isStarted;
	
    public QrScanner(Element element, Decode onDecode, String widthAndHight) {};
    
    public native void start();
	public native void stop();
	
	public void toggle() {
		if(isStarted) {
			this.isStarted = false;
			this.stop();
		} else {
			this.isStarted = true;
			this.start();
		}
	}
}
