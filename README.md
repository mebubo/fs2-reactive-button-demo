# FS2 Reactive Button Demo
This is the (very simple and tiny) code used to reactively render a button in my presentation: ["Streams - Your New Favorite Primitive"](https://slides.rpeters.dev/fs2-streams/) ([link to exact slide](https://slides.rpeters.dev/fs2-streams/index.html#/6/5)).
No extra libraries were used except for FS2, which of course depends on the wonderful Cats Effect library, and ScalaJS-DOM.

To try out yourself, run `sbt fastOptJS` and load `index.html` in your web browser.

**NOTE:** This style of rendering changes to the DOM is pretty inefficient at scale. Consider using a JavaScript framework such as React or Vue or something which is able to handle large changes efficiently. Both can work with this style of state management as well (it is similar to Flux or Redux which are standard JS architecture patterns).
