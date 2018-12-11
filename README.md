H1. GWT JsInterop wrapper for library: nimiq.qr-scanner
https://github.com/nimiq/qr-scanner

H1. Usage

Add those to main *.html file:

```
	<video muted autoplay playsinline id="qr-video" width="25%" height="25%"></video>

	<script type="module">
		import QrScanner from "/js/qr-scanner.min.js";
		window.QrScanner = QrScanner;
	</script>
	// your gwt module
	<script src="/js/app/app.nocache.js"></script>
```

And than in Your gwt config file:
```
	<inherits name='pl.korbeldaniel.gwt-qr-scanner' />
```

And than in Your java file:

```
import pl.korbeldaniel.qrscanner.QrScanner;

	private QrScanner scanner;


	private void initScanner() {
		scanner = new QrScanner(DomGlobal.document.getElementById("qr-video"),
				result -> handleScannedQrCode(result),
				"500");
	}

	private void handleScannedQrCode(String result) {
		Audio audio = Audio.createIfSupported();
		audio.setSrc("/audio/scan.mp3");
		audio.play();
		DomGlobal.console.log("decoded qa code:", result);
	}
```

And then You can start stop:
```
	scanner.start();
	scanner.stop();
```

