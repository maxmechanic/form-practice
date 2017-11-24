Randomly generates a set of inputs.

![input-practice](https://user-images.githubusercontent.com/1638576/33194589-dd27c672-d085-11e7-96a0-91e265c6494a.gif)


### Development mode

To start the Figwheel compiler, navigate to the project folder and run the following command in the terminal:

```
lein figwheel
```

Figwheel will automatically push cljs changes to the browser.
Once Figwheel starts up, you should be able to open the `public/index.html` page in the browser.


### Building for production

```
lein clean
lein package
```
