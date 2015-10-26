
package scalatex

import scalatags.Text.all._

object Readme{
  def apply(): Frag = scalatex.twf("D:\work\avs_scalatags\readme\Readme.scalatex")
}

//@import Main._
//@val exampleTests = wd/'scalatags/'shared/'src/'test/'scala/'scalatags/'generic/"ExampleTests.scala"
//
//@def exampleIn(name: String) = hl.ref(exampleTests, Seq(name, ""), Seq("  ,"))
//@def exampleIn2(name: String) = hl.ref(exampleTests, Seq(name, "  ,", ""), Seq("  ,"))
//@def exampleOut(name: String) = hl.ref(exampleTests, Seq(name, "\"\"\"", ""), Seq("\"\"\""), className = "xml")
//
//@val domTests = wd/'scalatags/'js/'src/'test/'scala/'scalatags/'jsdom/"DomTests.scala"
//@val cssTests = wd/'scalatags/'shared/'src/'test/'scala/'scalatags/'generic/"StyleSheetTests.scala"
//@def domExample(name: String) = hl.ref(domTests, Seq(name, ""), "//end")
//@def lnk(txt: String, src: String) = a(txt, href:=src)
//@val perfTests = wd/'scalatags/'shared/'src/'test/'scala/'scalatags/'generic/"PerfTests.scala"
//
//@a(
//  href:="https://github.com/lihaoyi/scalatags",
//  position.absolute,
//  top:=0,right:=0,border:=0,
//  img(
//    src:="https://camo.githubusercontent.com/a6677b08c955af8400f44c6298f40e7d19cc5b2d/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f6769746875622f726962626f6e732f666f726b6d655f72696768745f677261795f3664366436642e706e67",
//    alt:="Fork me on GitHub"
//  )
//)
//
//@sect{ScalaTags 0.5.2}
//  @p
//    ScalaTags is a small, @sect.ref("Performance", "fast") XML/HTML/CSS construction library for @lnk("Scala", "http://www.scala-lang.org/") that takes fragments in plain Scala code that look like this:
//
//  @exampleIn("splashExample")
//
//  @p
//    And turns them into HTML like this:
//
//  @exampleOut("splashExample")
//
//  @sect{Getting Started}
//
//    @p  
//      ScalaTags is hosted on @lnk("Maven Central", "http://search.maven.org/#search%7Cga%7C1%7Cscalatags"); to get started, simply add the following to your `build.sbt`:
//
//    @hl.scala
//      libraryDependencies += "com.lihaoyi" %% "scalatags" % "0.5.2"
//  
//    @p
//      And you're good to go! Open up a @code{sbt console} and you can start working through the @lnk("Examples", "#Examples"), which should just work when copied and pasted into the console.
//
//    @sect{ScalaJS}
//
//      @p
//        To use Scalatags with a ScalaJS project, add the following to the `built.sbt` of your ScalaJS project:
//
//      @hl.scala
//        libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.5.2"
//
//      @p
//        And you should be good to go generating HTML fragments in the browser! Scalatags has no dependencies, and so all the examples should work right off the bat whether run in Chrome, Firefox or Rhino. Scalatags 0.5.2 is currently only compatibly with ScalaJS 0.5.3+.
//  @sect{Why Scalatags}
//    @p
//      The core functionality of Scalatags is a @lnk("tiny amount of code", "shared/main/scala/scalatags/generic/Core.scala"), and yet it provides all the functionality of large frameworks like Python's @lnk("Jinja2", "http://jinja.pocoo.org/docs/sandbox/") or C#'s @lnk("Razor", "http://msdn.microsoft.com/en-us/vs2010trainingcourse_aspnetmvc3razor.aspx"), and out-performs the competition by a @sect.ref("Performance", "large margin"). It does this by leveraging the functionality of the Scala language to do almost @b{everything}, meaning you don't need to learn a second template pseudo-language just to stitch your HTML fragments together
//    @p
//      Since ScalaTags is pure Scala, any editor that understands Scala will understand scalatags.Text. Not only do you get syntax highlighting, you also get code completion:
//    
//    @img(width:="100%", alt:="Autocomplete", src:="https://raw.githubusercontent.com/lihaoyi/scalatags/master/readme/resources/Autocomplete.png")
//
//    @p
//      and Error Highlighting:
//
//    @img(width:="100%", alt:="Error Highlighting", src:="https://raw.githubusercontent.com/lihaoyi/scalatags/master/readme/resources/ErrorHighlighting.png")
//
//    @p
//      and in-editor documentation:
//
//    @img(width:="100%", alt:="Inline Documentation", src:="https://raw.githubusercontent.com/lihaoyi/scalatags/master/readme/resources/InlineDocs.png")
//
//    @p
//      And all the other good things (@b{jump to definition}, @b{extract method}, etc.) you're used to in a statically typed language. No more digging around in templates which mess up the highlighting of your HTML editor, or waiting months for the correct plugin to materialize.
//    @p
//      Take a look at the @sect.ref("Prior Work") section for a more detailed analysis of Scalatags in comparison to other popular libraries.
//
//  @sect{Basic Examples}
//
//    @p
//      This is a bunch of simple examples to get you started using Scalatags. These examples are all in the unit tests, so feel free to click the links to see them in full. For more examples, take a look at the @lnk("demo page", "http://lihaoyi.github.io/scalatags/demo.html"), backed by the code in @lnk("example/", "https://github.com/lihaoyi/scalatags/blob/master/example/src/main/scala/example/ScalaJSExample.scala")
//
//    @sect{Hello World}
//
//      @exampleIn("helloWorld")
//
//      @p
//        The core of Scalatags is a way to generate (X)HTML fragments using plain Scala. This is done by values such as `head`, `script`, and so on, which are automatically imported into your program when you `import scalatags.Text.all._`. See @sect.ref("Managing Imports", "below") if you want more fine-grained control over what's imported.
//      @p
//        This example code creates a Scalatags fragment. We could do many things with a fragment: store it, return it, etc. since it's just a normal Scala value. Eventually, though, you will want to convert it into HTML. To do this, simply use:
//
//      @hl.scala
//        frag.toString
//
//
//      @p
//        Which will give you a String containing the HTML representation:
//
//      @exampleOut("helloWorld")
//
//      @p
//        If you want to add a doctype to your HTML fragment, simply add it as a string:
//
//      @hl.scala
//        "<!DOCTYPE html>" + html(
//          ...
//        )
//
//      @p
//        The following examples will simply show the initial Scalatag fragment and the final pretty-printed HTML, skipping the intermediate steps.
//
//    @sect{Attributes}
//
//      @exampleIn("attributes")
//
//      @p
//        In Scalatags, each attribute has an associated value which can be used to set it. This example shows how you set the @code{onclick} and @code{href} attributes with the @code{:=} operator. Attributes are all instances of the @hl.scala{Attr} class.
//
//      @p
//        The common HTML attributes all have static values to use in your fragments. This keeps things concise and statically checked. However, inevitably you'll want to set some attribute which isn't in the initial list defined by scalatags.Text. This can be done with the `.attr` method that Scalatags adds to Strings:
//
//      @exampleIn2("attributes")
//
//      @p
//        If you wish to, you can also take the result of the @code{.attr} call and assign it to a variable for you to use later in an identical way.
//
//      @exampleIn("customAttributesAndStyles")
//
//      @p
//        Both the above examples print the same thing:
//
//      @exampleOut("attributes")
//
//    @sect{Inline Styles & Classes}
//
//      @exampleIn("classesAndCssCustom")
//
//      @p
//
//        In HTML, @code{style} attributes are often thought of not as normal attributes (which contain strings), but as lists of key-value pairs. Furthermore, there is a large but finite number of styles, and a style cannot simply be any arbitrary string. The above example shows how CSS classes and inline-styles are typically set.
//
//      @p
//
//        Note that in this case, @code{backgroundColor}, @code{color} and @code{opacity} are all statically typed identifiers. These are all instances of @code{Style} and are defined by Scalatags.
//
//      @p
//        Of course, @code{style} is in the end just an attribute, so you can treat it as such and bind them directly without any fuss:
//      @exampleIn2("classesAndCssCustom")
//
//      @p
//        Both the above examples print the same thing:
//
//      @exampleOut("classesAndCssCustom")
//
//      @p
//        A list of the attributes and styles provided by ScalaTags can be found in @lnk("Attrs", "https://github.com/lihaoyi/scalatags/blob/master/scalatags/shared/src/main/scala/scalatags/generic/Attrs.scala") and @lnk("Styles", "https://github.com/lihaoyi/scalatags/blob/master/scalatags/shared/src/main/scala/scalatags/generic/Styles.scala"). This of course won't include any which you define yourself.
//
//
//    @sect{Non-String Attributes and Styles}
//      @exampleIn("nonStringAttributesAndStyles")
//
//      @p
//        Not all attributes and styles take strings; some, like @code{float}, have an enumeration of valid values, and can be referenced by @code{float.left}, @code{float.right}, etc.. Others, like @code{tabindex} or @code{disabled}, take Ints and Booleans respectively. These are used directly as shown in the example above.
//      @p
//        Even for styles or attributes which take values other than strings (e.g. @code{tabindex}), the @code{:=} operator can still be used to force assignment:
//
//      @p
//        The above example prints:
//
//      @exampleOut("nonStringAttribuetsAndStyles")
//
//      @p
//        Passing in numbers to the styles which require a @code{px} at the end results in the @code{px} being appended automatically:
//
//      @hl.scala
//        div(width:=100, zIndex:=100, padding:=100)
//      @hl.xml
//        <div style="width: 100px; z-index: 100; padding: 100px;"></div>
//
//      @p
//        Note how this doesn't affect other styles (e.g. @code{z-index}) which don't need this suffix. Generally, just pass in whatever you want and it'll do the right thing.
//
//      @p
//        Boolean attributes such as @code{readonly} can be passed in alone:
//
//      @exampleIn("booleanAttributes")
//      @exampleOut("booleanAttributes")
//
//      @p
//        And will default to a value with the same name as the attribute. You can still set the value manually with @code{:=} if you wish
//
//      @exampleIn("booleanAttributes2")
//      @exampleOut("booleanAttributes2")
//      
//    @sect{Managing Imports} 
//
//      @exampleIn("manualImports")
//
//      @p
//        Apart from using @hl.scala{import scalatags.Text.all._}, it is possible to perform the imports manually, renaming whatever you feel like renaming. The example above provides an example which imports all HTML tags, but imports @code{Attrs} and @code{Styles} aliased rather than dumping their contents into your global namespace. This helps avoid polluting your namespace with lots of common names (e.g. @code{value}, @code{id}, etc.) that you may not use.
//      @p
//        The main objects which you can import things from are:
//      @ul
//        @li
//          @code{tags}: common HTML tags
//        @li
//          @code{tags2}: less common HTML tags
//        @li
//          @code{attrs}: common HTML attributes
//        @li
//          @code{styles}: common CSS styles
//        @li
//          @code{styles2}: less common CSS styles
//        @li
//          @code{svgTags}: SVG tags
//        @li
//          @code{svgAttrs}: attributes only associated with SVG elements
//        @li
//          @code{DataConverters}: convenient extensions (e.g. `10.px`) to create the CSS datatypes
//
//      @p
//        You can pick and choose exactly which bits you want to import, or you can use one of the provided aggregates:
//
//      @ul
//        @li
//          @code{all}: this imports the contents of @code{Tags}, @code{Attrs}, @code{Styles} and @code{DataConverters}
//
//        @li
//          @code{short}: this imports the contents of @code{Tags} and @code{DataConverters}, but aliases @code{Attrs} and @code{Styles} as @code{*}
//      @p
//        Thus, you can choose exactly what you want to import, and how:
//
//      @exampleIn2("manualImports")
//
//      @p
//        Or you can rely on a aggregator like @code{all} (which the rest of the examples use) or @code{short}. @code{short} imports @code{Attrs} and @code{Styles} as @code{*}, making them quick to access without cluttering the global namespace:
//
//      @exampleIn("manualImports")
//      @p
//        Both these examples print:
//
//      @exampleOut("manualImports")
//      @p
//        This custom import object also provides you a place to define your own custom tags that will be imported throughout your project e.g. a @hl.scala{js(s: String)} tag as shorthand for @hl.scala{script(src:=s)}. You can even override the default definitions, e.g. making @code{script} be a shorthand for @hl.scala{script(type:="javascript")} so that you can never forget to use your own custom version.
//
//      @p
//        The lesser used tags or styles are generally not imported wholesale by default, but you can always import the ones you need:
//
//      @exampleIn("additionalImports")
//      @p
//        This prints:
//
//      @exampleOut("additionalImports")
//    @sect{Custom Bundles}
//
//
//      @hl.scala
//        object CustomBundle extends Text.Cap with text.Tags with text.Tags2 with Text.Aggregate{
//          object st extends Text.Cap with Text.Styles with Text.Styles2
//          object at extends Text.Cap with Text.Attrs
//        }
//
//        import CustomBundle._
//
//        html(
//          head(
//            script("some script")
//          ),
//          body(
//            h1(st.backgroundColor:="blue", st.color:="red")("This is my title"),
//            div(st.backgroundColor:="blue", st.color:="red")(
//              p(at.cls := "contentpara first")(
//                "This is my first paragraph"
//              ),
//              a(st.opacity:=0.9)(
//                p(at.cls := "contentpara")("Goooogle")
//              )
//            )
//          )
//        )
//      @p  
//
//        In addition to importing things piecemeal from various pre-defined namespaces, Scalatags allows you to build a custom bundle which can be used to provide a single-import syntax for whatever import convention you're using. For example, the above snippet sets up a custom bundle which dumps @code{Tags} and @code{Tags2} in the local namespace, assigns @code{Styles} and @code{Styles2} to the @code{st} object, @code{Attrs} to the @code{at} object, and ignores Svg-related styles and tags entirely. This lets you enforce a particular convention without having to duplicate the same import-renamings in multiple files in your application.
//      @p
//        The above snippet prints the following:
//      @hl.xml
//        <html>
//            <head>
//                <script>some script</script>
//            </head>
//            <body>
//                <h1 style="background-color: blue; color: red;">This is my title</h1>
//                <div style="background-color: blue; color: red;">
//                <p class="contentpara first">This is my first paragraph</p>
//                <a style="opacity: 0.9;">
//                    <p class="contentpara">Goooogle</p>
//                </a>
//                </div>
//            </body>
//        </html>
//      @p
//
//        Despite its usefulness in enforcing a particular import convention, custom bundles are completely interoperable with each other or with the default @code{all} and @code{short} bundles, and the above snippet could equally be written as:
//
//      @hl.scala
//        import CustomBundle.{st, at}
//        import Text.all._
//
//        CustomBundle.html(
//          head(
//            script("some script")
//          ),
//          CustomBundle.body(
//            h1(backgroundColor:="blue", st.color:="red")("This is my title"),
//            div(st.backgroundColor:="blue", color:="red")(
//              p(cls := "contentpara first")(
//                "This is my first paragraph"
//              ),
//              CustomBundle.a(st.opacity:=0.9)(
//                p(at.cls := "contentpara")("Goooogle")
//              )
//            )
//          )
//        )
//      @p
//
//        Mixing both things from the @code{all} bundle as well as @code{st} and @code{at} from our own @code{CustomBundle}. That's not to say you @b{should} do this, but if for some reason if e.g. you're using different conventions for different source files, you can be sure that they'll work together just fine.
//
//    @sect{Variables}
//      @exampleIn("variables")
//      @p
//        Variables can be inserted into the templates as Strings, simply by adding them to an element's children. This prints:
//
//      @exampleOut("variables")
//    @sect{Control Flow}
//      @exampleIn("controlFlow")
//      @p
//
//        Like most other XML templating languages, ScalaTags contains control flow statements like @hl.scala{if} and @hl.scala{for}. Unlike other templating languages which have their own @lnk("crufty little programming language embedded inside them for control flow", "http://jinja.pocoo.org/docs/templates/#list-of-control-structures"), you probably already know how to use ScalaTags' control flow syntax. It's just Scala after all.
//      @p
//        This prints out:
//
//      @exampleOut("controlFlow")
//
//    @sect{Functions}
//      @exampleIn("functions")
//      @p
//
//        Many other templating systems define @lnk("incredibly", "http://guides.rubyonrails.org/layouts_and_rendering.html#using-partials") @lnk("roundabout", "http://jinja.pocoo.org/docs/templates/#macros") ways of creating re-usable parts of the template. In ScalaTags, we don't need to re-invent the wheel, because Scala has these amazing things called *functions*.
//
//      @p
//        The above example prints:
//
//      @exampleOut("functions")
//    @sect{Auto-escaping and unsanitized Input}
//
//      @exampleIn("properEscaping")
//      @p
//        By default, any text that's put into the Scalatags templates, whether as a attribute value or a text node, is properly escaped when it is rendered. Thus, when you run the following snippet, you get this:
//      @exampleOut("properEscaping")
//      @p
//        As you can see, the contents of the variables @code{evilInput1} and @code{evilInput2} have been HTML-escaped, so you do not have to worry about un-escaped user input messing up your DOM or causing XSS injections. Furthermore, the names of the tags (e.g. "html") and attributes (e.g. "href") are themselves validated: passing in an invalid name to either of those (e.g. a tag or attribute name with a space inside) will throw an `IllegalArgumentException`).
//
//      @p
//        If you @b{really} want, for whatever reason, to put unsanitized input into your HTML, simply surround the string with a @code{raw} tag:
//
//      @exampleIn("unsanitizedInput")
//      @p
//        prints
//
//      @exampleOut("unsanitizedInput")
//      @p
//        As you can see, the @hl.xml{<script>} tags in @code{evilInput} have been passed through to the resultant HTML string unchanged. Although this makes it easy to open up XSS holes (as shown above!), if you know what you're doing, go ahead.
//      @p
//        There isn't any way to put unescaped text inside tag names, attribute names, or attribute values.
//
//    @sect{Layouts}
//      @exampleIn("layouts")
//      @p
//
//        Again, this is something that many other templating languages have their own @lnk("special", "http://guides.rubyonrails.org/layouts_and_rendering.html#using-nested-layouts") @lnk("implementations", "http://jinja.pocoo.org/docs/templates/#template-inheritance") of. In ScalaTags, this can be done simply by just using functions! The above snippet gives you:
//
//      @exampleOut("layouts")
//
//    @sect{Inheritance}
//      @exampleIn("inheritence")
//      @p
//        Most of the time, functions are sufficient to keep things DRY, but if for some reason you want to use inheritance to structure your code, you probably already know how to do so. Again, unlike @lnk("other", "http://wsgiarea.pocoo.org/jinja/docs/inheritance.html") @lnk("frameworks", "http://docs.makotemplates.org/en/latest/inheritance.html") that have implemented complex inheritance systems themselves, Scalatags is just Scala, and it behaves as you'd expect.
//
//      @exampleOut("inheritence")
//    @sect{Data and Aria}
//
//      @p
//        Data attributes work by separating the sections of the attribute with @code{.} instead of @code{-}:
//
//      @exampleIn("data")
//      @exampleOut("data")
//      @p
//        Aria attributes work too:
//
//      @exampleIn("aria")
//      @exampleOut("aria")
//
//
//  @sect{DOM Backend}
//    @p
//      Although Scalatags was originally a HTML-String generation library, it now ships with an additional backend that runs only on ScalaJS, available by replacing
//
//    @hl.scala
//      import scalatags.Text._
//
//
//    @p
//      with
//
//    @hl.scala
//      import scalatags.JsDom._
//    @p
//
//      This gives you a version of Scalatags that renders directly to @hl.scala{dom.Element}s, rather than spitting out strings. With the DOM backend, @code{toString} still works and generates a HTML string, but is implemented by constructing a tree of @hl.scala{dom.Element}s and calling @hl.scala{.outerHTML} on them, and the resultant string may have subtle differences (e.g. order of attributes, or whitespace between styles) from the Text backend.
//
//    @sect{Using the DOM}
//      @p
//
//        The DOM backend provides an additional method @hl.scala{.render} on all Scalatags fragments, which converts the fragment into a DOM tree:
//
//      @domExample("children")
//      @p
//
//        As you can see, you can manipulate DOM elements directly, calling standard DOM APIs like @code{.children}, @code{.appendChild}, etc.
//
//      @p
//        In addition to the default ability to splice @hl.scala{String}s, @hl.scala{Boolean}s and @hl.scala{Int}s into the Scalatags fragment, the DOM backend allows you to bind arbitrary @hl.scala{js.Any}-convertible objects, e.g. the function literal shown below:
//
//      @domExample("boundAttributes")
//
//      @p
//        As you can see, the function literal is kept intact rather than being serialized (as you would expect in the Text backend). When called via the attribute of the element, you can see that it functions intact and properly increments the counter.
//
//    @sect{Use Cases}
//      @p
//        Having direct access to the DOM allows a great deal of flexibility that you do not have when working with strings. For example, the example below defines an input-label pair which clears the label when you focus on the input, a common pattern:
//
//      @domExample("triggers")
//
//      @p
//        This allows a very convenient direct-binding of behaviors without having to trawl through the DOM with jquery selectors or creating lots of IDs and worrying about collisions.
//
//    @hr 
//    @p
//      The DOM backend currently requires you to separately add a dependency on @lnk("scala-js-dom", "https://github.com/scala-js/scala-js-dom") for it to function.
//
//  @sect{CSS Stylesheets}
//    @p
//      Scalatags offsets an internal DSL for constructing CSS Stylesheets. The basic construction looks like:
//
//    @hl.ref(cssTests, "val Simple", "val Inline")
//
//    @p
//      This generates a stylesheet that looks like
//    
//    @hl.ref(cssTests, "$pkg-Simple", "\"\"\"", className = "css")
//
//    @p
//      Note that you need to use a separate @hl.scala{trait} and @hl.scala{val} in order for this to work; you cannot just have an @hl.scala{object Simple} extend @hl.scala{StyleSheet} directly.
//    @p
//
//      You can then access @hl.scala{Simple.styleSheetText} in order to do things with the generated stylesheet text. Exactly what you want to do is up to you: In Scala-JVM you will likely want to save it to a file (to be served later) or inlined into some HTML fragment, while in Scala.js you may insert it into the page directly via a `style` tag.
//    @p
//      Only @hl.scala{cls}s defined on `trait Simple` are gathered up as part of the generated stylesheet. By default, the name of each class is constructed via the names @hl.scala{$pkg-$class-$def}. You can override @hl.scala{customSheetName} to replace the @hl.scala{pkg-$class} part with something else.
//    @p
//      Once the stylesheet is defined, you can then immediately start using styles within your Scalatags fragments, just like any other @hl.scala{Modifier}:
//
//
//
//    @hl.ref(cssTests, Seq("htmlFrag", "val x = div"), "val")
//    @hl.ref(cssTests, Seq("htmlFrag", "val expected", ""), "\"\"\"", className = "xml")
//
//    @p
//      By default, Scalatag's @hl.scala{StyleSheet}s have no cascading: you only can define styles for a single class (and it's pseudo-selectors) at a single time. If you want to define styles for multiple tags without a larger HTML fragment, you should define multiple classes. The fact that Scalatag's @hl.scala{cls} definitions are just normal @hl.scala{def}s makes managing these classes very easy: you can use standard IDE's or tools to jump-to-definitions, auto-rename them, etc.. Many common mistakes in CSS, such as accidentally mis-spelling a class-name or botching a renaming, become compilation errors.
//    @p
//      Since Scalatags @hl.scala{StyleSheet}s are just Scala, you can feel free to use normal Scala techniques (constants, functions, traits, etc.) to DRY up your code without having to learn any special Scalatags-specific mechanisms.
//
//    @sect{Inline Modifiers}
//
//      @p
//        The above example contains a single @code{hover} pseudo-selector, but what if you want the same class to have a whole range of pseudo-selectors? To do that, simply nest the selectors inline inside the @code{cls} fragment:
//
//      @hl.ref(cssTests, "val Inline", "val Cascade")
//
//      @p
//        This generates the stylesheet:
//        
//      @hl.ref(cssTests, "$pkg-Inline", "\"\"\"", className = "css")
//
//    @sect{Cascading}
//
//      @p
//        Occassionally, you really do want your CSS stylesheets to cascade. This may be e.g. because you want to define styles for a large HTML document, and don't want to repeat the "default" classes throughout your HTML. In order to do this with Scalatags, you have to opt in by inheriting from @hl.scala{CascadingStyleSheet}:
//      @hl.ref(cssTests, "val Cascade", "val Custom")
//      @p
//        This generates:
//
//      @hl.ref(cssTests, "$pkg-Cascade", "\"\"\"", className = "css")
//      @p
//        With Scalatags, even cascadin styles must start with a "root" class. However,inside that class, you then have two ways of defining cascades:
//      @ul
//
//        @li
//          Via nesting: you can nest Scalatags HTML tags such as @code{a} or @code{div}, or other pre-defined classes such as @hl.scala{Cascade.y}
//        @li
//          Via the @hl.scala{~} or @hl.scala{>} operators, for defining a chain with or without the @hl.scala{>} child-selector
//      @p
//        You shouldn't need cascading often, but when you do, it's useful to have around. Scalatags gives you the best of both worlds by exposing it where necessary but preventing you from using it by accident.
//
//  @hr 
//  @p
//    Scalatags' CSS support is minimal and opinionated, and intentionally much less featureful than @lnk("Scala-CSS", "https://japgolly.github.io/scalacss/book/"). While the feature set will probably grow slightly to accommodate people's needs, it will always be a comparatively small, spartan API.
//
//  @sect{Performance}
//   
//    @table
//      @thead
//        @th{Template Engine} @th{Renders}
//      @tbody
//        @tr
//          @td{Scalatags} @td{7436041}
//        @tr
//          @td{scala-xml} @td{3794707}
//        @tr
//          @td{Twirl} @td{1902274}
//        @tr
//          @td{Scalate-Mustache} @td{500975}
//        @tr
//          @td{Scalate-Jade} @td{396224}
//    @p
//
//      These numbers are the number of times each template engine is able to render (to a String) a simple, dynamic HTML fragment in 60 seconds.
//    @p
//      The fragment (shown below) is designed to exercise a bunch of different functionality in each template engine: functions/partials, loops, value-interpolation, etc.. The templates were structured identically despite the different languages used by the various engines. All templates were loaded and rendered once before the benchmarking begun, to allow for any file-operations/pre-compilation to happen.
//    @p
//      The numbers speak for themselves; Scalatags is almost twice as fast as splicing/serializing @code{scala-xml} literals, almost four times as fast as @lnk("Twirl", "http://www.playframework.com/documentation/2.2.x/ScalaTemplates"), and 10-15 times as fast as the various @lnk("Scalate", "http://scalate.fusesource.org/") alternatives. This is likely due to overhead from the somewhat bloated data structures used by @code{scala-xml} (which Twirl also uses) and the heavy-use of dictionaries used to implement the custom scoping in the Scalate templates. Although this is a microbenchmark, and probably does not perfectly match real-world usage patterns, the conclusion is pretty clear: Scalatags is fast!
//    @p
//      This is the Scalatags fragment that was rendered:
//
//    @hl.ref(perfTests, Seq("def calc", ""))
//    @hl.ref(perfTests, Seq("val expected", "\"\"\"", ""))
//
//    @p
//      The rest of the code involved in this micro-benchmark can be found in @lnk("PerfTests.scala", "shared/test/scala/scalatags/PerfTests.scala")
//
//
//  @sect{Internals}
//    @p
//
//      The primary data structure Scalatags uses are the @hl.scala{TypedTag}:
//
//    @hl.scala
//      trait TypedTag[Builder, +Output, FragT] extends Frag[Builder, FragT]{
//        def tag: String
//
//        /**
//         * The modifiers that are applied to a TypedTag are kept in this linked-Seq
//         * (which are actually WrappedArrays) data-structure in order for maximum
//         * performance.
//         */
//        def modifiers: List[Seq[Modifier[Builder]]]
//
//        /**
//         * Add the given modifications (e.g. additional children, or new attributes)
//         * to the [[TypedTag]].
//         */
//        def apply(xs: Modifier[Builder]*): Self
//
//        /**
//         * Collapses this scalatags tag tree and returns an [[Output]]
//         */
//        def render: Output
//      }
//      
//
//    @p
//      The @hl.scala{Modifier}:
//
//    @hl.scala
//      trait Modifier[Builder] {
//        /**
//         * Applies this modifier to the specified [[Builder]], such that when
//         * rendering is complete the effect of adding this modifier can be seen.
//         */
//        def applyTo(t: Builder): Unit
//      }
//
//
//    @p
//      And the @hl.scala{Frag}:
//
//    @hl.scala 
//      trait Frag[Builder, FragT] extends Modifier[Builder]{
//        def render: FragT
//      }
//
//    @p
//
//      A @hl.scala{TypedTag} is basically a tag-name together with a loose bag of @hl.scala{Modifier}s, and is itself a @hl.scala{Modifier} so it can be nested within other @hl.scala{TypedTag}s. A @hl.scala{Modifier} is a tag, a sequence of tags, an attribute binding, a style binding, or anything else that can be used to modify how a tag will be rendered. Lastly, a @hl.scala{Frag} represents the smallest standalone atom, which includes tags, loose strings, numbers, and other things.
//    @p
//      In the text backend you have the alias
//
//    @hl.scala
//      type Tag = TypedTag[String]
//    @p
//
//      Since everything renders to a string. In the DOM backend you have:
//
//    @hl.scala
//      type HtmlTag = JsDom.TypedTag[dom.HTMLElement]
//      type SvgTag = JsDom.TypedTag[dom.SVGElement]
//      type Tag = JsDom.TypedTag[dom.Element]
//
//    @p
//      These aliases help you keep your code short by letting you refer to the most common versions of @hl.scala{TypedTag} via concise names.
//
//    @p
//      Each Scalatags backend has its own refinements, e.g. @hl.scala{Text.TypedTag}, @hl.scala{Text.Frag} and @hl.scala{Text.Modifier} have the @hl.scala{Builder} type-parameter fixed as @hl.scala{text.Builder}, and the @hl.scala{Output} type-parameter fixed as @hl.scala{String}. Their @hl.scala{JsDom.*} counterparts have @hl.scala{Builder} fixed as @hl.scala{dom.Element}, and @hl.scala{Output} fixed to various subclasses of @hl.scala{dom.Element}. The various other classes/traits (e.g. @hl.scala{Attr}, @hl.scala{AttrPair}, @hl.scala{StylePair}, etc.) are similarly abstract with concrete versions in each backend.
//    @p
//      The current selection of @hl.scala{Modifier}s (or implicitly convertable) types include:
//    @ul
//      @li
//        @hl.scala{TypedTag}s and @hl.scala{String}s: appends itself to the parent's @hl.scala{children} list.
//      @li 
//        @hl.scala{AttrPair}s: sets a key in the parent's @hl.scala{attrs} list.
//      @li
//        @hl.scala{StylePair}s: appends the inline @hl.scala{style: value;} to the parent's @hl.scala{style} attribute.
//      @li
//        @hl.scala{StringFrag}s: append the string as a child.
//      @li
//        @hl.scala{RawFrag}s: append the string to the parent as unescaped HTML.
//    @p
//      The bulk of Scalatag's ~5000 lines of code is static bindings (and inline documentation!) for the myriad of CSS rules and HTML tags and attributes that exist. The core of Scalatags lives in @lnk("Core.scala", "shared/main/scala/scalatags/Core.scala"), with most of the implicit extensions and conversions living in @lnk("package.scala", "shared/main/scala/scalatags/package.scala").
//    @sect{Architecture}
//
//      @p
//
//        Scalatags has pretty odd internals in order to support code re-use between the Text and Dom packages. Essentially, each Scalatags package is an instance of
//
//      @hl.scala
//        trait Bundle[Builder, Output <: FragT, FragT]{
//
//      @p
//        Which is parametrized on the @code{Builder} used to generate the output, the type generated by rendering a @code{Frag}, as well as the final @code{Output} type generated by rendering a @code{TypedTag}. The Text package is defined as
//
//      @hl.scala
//        object Text extends Bundle[text.Builder, String, String] {
//
//      @p
//        Since it uses a custom @code{text.Builder} object for maximum performance and spits out a @code{String}, while the Dom package is defined as as
//
//      @hl.scala
//        object JsDom extends generic.Bundle[dom.Element, dom.Element, dom.Node]
//
//
//      @p
//        Since it uses @code{dom.Element}s both as the intermediate builder as well as the final result.
//
//      @p
//        This layout allows Scalatags to specify formally which types are common between the two backends (i.e. those in @code{generic.Bundle}) and which can vary. For example, both backends have a concept of @code{TypedTag}s, @code{Frag}s and @code{Modifier}s. On the other hand, The Text backend has @hl.scala{TypedTag[String]} aliased as @code{Tag} since it will always be @code{String}, while the Dom backend has it left as
//
//      @hl.scala
//        TypedTag[+Output <: dom.Element]
//
//      @p
//        With helper types bound as:
//
//      @hl.scala
//        type HtmlTag = TypedTag[dom.HTMLElement]
//        type SvgTag = TypedTag[dom.SVGElement]
//        type Tag = TypedTag[dom.Element]
//      @p
//
//        Since it is likely that working with the Dom backend you will want to distinguish these.
//
//    @sect{Extensibility}
//
//      @p
//        A mix of typeclasses and implicit conversions is used to control what you can put into a Scalatags fragment. For example, the typeclasses
//
//      @hl.scala
//        trait AttrValue[Builder, T]{
//          def apply(t: Builder, a: Attr, v: T)
//        }
//        trait StyleValue[Builder, T]{
//          def apply(t: Builder, s: Style, v: T)
//        }
//      @p
//
//        Allow you to specify what (and how) types can be used as attributes and styles respectively, while implicit conversions to @code{Modifier} or @code{Frag} are used to allow you to use arbitrary types as children. The use of implicit conversions in this case is to allow it to work with variable length argument lists (i.e. @hl.scala{(mods: *Modifier)}), which is difficult to do with typeclasses.
//      @p
//        Due to this design, and the parametrization of the bundles described earlier, it is possible to define behavior for a particular type only where it makes sense. e.g. there is a pair of typeclass instances
//
//      @hl.scala
//        implicit object bindJsAny extends generic.AttrValue[dom.Element, js.Any]
//        implicit def bindJsAnyLike[T <% js.Any] = new generic.AttrValue[dom.Element, T]
//      @p
//
//        Which allows you to bind anything convertible to a @code{js.Any} into the JsDom fragments, since they can just be assigned directly to the attributes of the @code{dom.Element} objects. Doing the same thing for Text fragments doesn't make sense, and would correctly fail to compile.
//      @p
//        You can easier add other typeclass instances to handle binding e.g. @code{Future}s (which will add a child or set an attr/style on completion), or reactive variables (which would constantly update the child/attr/style every time it changes).
//
//    @sect{Cross-backend Code}
//
//
//      @p
//        If you wish to, it is possible to write code that is generic against the Scalatags backend used, and can be compiled and run on both Text and JsDom backends at the same time! This is done by adding an explicit dependency on @hl.scala{generic.Bundle[Builder, Output, FragT]}, e.g. how it is done in the unit tests:
//
//      @hl.scala
//        class ExampleTests[Builder, Output, FragT](bundle: Bundle[Builder, Output, FragT]) extends TestSuite{
//          import bundle._
//          ...
//        }
//        
//      @p
//        Inside this scope, you are limited to only using the common functionality defined in @hl.scala{generic.Bundle}, and can't use any Text or JsDom specific APIs. However, in exchange you can write code that works in either backend, by instantiating it with the respective bundle:
//
//      @hl.scala
//        object ExampleTests extends generic.ExampleTests(scalatags.Text)
//        object ExampleTests extends generic.ExampleTests(scalatags.JsDom)
//      @p
//
//        This is currently used to shared the bulk of unit tests between the Text and JsDom backends, and could be useful in other scenarios where you may want to swap between them (e.g. using Text on the server, and JsDom on the client where it's available) while sharing as much code as possible.
//      @p
//        For a concrete, self-contained example of this, look at the @lnk("demo page", "https://github.com/lihaoyi/scalatags/blob/master/example/src/main/scala/example/ScalaJSExample.scala").
//
//  @sect{Prior Work}
//
//
//    @p
//      Scalatags was made after experience with a broad range of HTML generation systems. This experience (with both the pros and cons of existing systems) informed the design of scalatags.Text.
//
//    @sect{Old-school Templates}
//      @p
//        @lnk("Jinja2", "http://jinja.pocoo.org/docs/") is the templating engine that comes bundled with @lnk("Flask", "http://flask.pocoo.org/"), a similar (but somewhat weaker) system comes bundled with @lnk("Django", "https://docs.djangoproject.com/en/dev/topics/templates/"), and another system in a similar vein is @lnk("Ruby on Rail's ERB", "http://guides.rubyonrails.org/layouts_and_rendering.html") rendering engine. This spread more-or-less represents the old-school way of rendering HTML, in that they:
//      @ul
//        @li
//          Are effectively string-based
//        @li
//          Use special syntax for both interpolating variables as well as for basic control flow logic
//        @li
//          Have a ruby/python-like (but not quite!) language for logic within the template
//        @li
//          Are generally with one template per file.
//      @p
//        They also showcase many of the weaknesses of this style of templating system:
//      @ul
//        @li
//          The fact that it's string based means it's vulnerable to XSS injections, or plain-old malformed HTML output.
//
//        @li
//          The one-template-per-file rule discourages you from building your page from small re-usable fragments, because who wants to keep track of hundreds of individual files. People are reluctant to make a file with 3-5 lines in it, which is understandable but unfortunate because factoring templates into re-usable 3-5 line snippets is a good way of staying sane.
//        @li
//          The API is complex and novel: Jinja2 for example contains logic around @lnk("file-loading", "http://jinja.pocoo.org/docs/api/#loaders") & @lnk("caching", "http://jinja.pocoo.org/docs/api/#bytecode-cache"), as well as custom Jinja2-specific ways of doing @lnk("loops", "http://jinja.pocoo.org/docs/templates/#for"), @lnk("conditionals", "http://jinja.pocoo.org/docs/templates/#if"), @lnk("functions", "http://jinja.pocoo.org/docs/templates/#macros"), @lnk("comments", "http://jinja.pocoo.org/docs/templates/#comments"), @lnk("inheritance", "http://jinja.pocoo.org/docs/templates/#template-inheritance"), @lnk("scoping", "http://jinja.pocoo.org/docs/templates/#block-nesting-and-scope"), @lnk("imports", "http://jinja.pocoo.org/docs/templates/#import-context-behavior") and other things. All these are things you would have to learn.
//        @li
//          The syntax is completely new; finding an editor that properly supports all the quirks and semantics (or even simply highlighting things properly) is hard. You could hack together something quick and extremely fragile, or you could wait ages for a solid plugin to materialize.
//        @li
//          Abstraction is clunky: inbuilt tags are used via `<div />`, while user-defined components are called e.g. by `{{ component() }}`. You're left with a choice between not using much abstraction and mainly sticking to inbuilt tags, or creating components and accepting the fact that your templates will basically be totally composed of `{{ curly braces }}`. Neither choice is satisfying.
//        @li
//          Have no sort of static checking at all; you're just passing dicts around, and waiting for silly mistakes to blow up at run-time so you can fix them.
//
//    @sect{Razor and Play Templates}
//
//      @p
//        @lnk("Razor", "https://github.com/Antaris/RazorEngine") (the ASP.NET MVC template engine) and the Play framework's @lnk("template engine", "http://www.playframework.com/documentation/2.3-SNAPSHOT/ScalaTemplates") go in a new direction. Their templates generally:
//      @ul
//        @li
//          Are statically-compiled
//        @li
//          Re-use large chunks of the host language
//      @p
//        Both templating systems generally use @hl.scala{@@} to delimit "code"; e.g. @hl.scala{@@for(...){...}} declares a for-loop. Nice things are:
//      @ul
//        @li
//          The API is far simpler: all the custom control-flow/logic/syntax   basically collapses into the simple statement "do it the way C#/Scala does it".
//        @li
//          Static checking in templates is nice.
//      @p
//        However, they still have their downsides:
//      @ul
//        @li
//          Abstractions are less clunky to use than in old-school templates, e.g. @hl.scala{@@component()} rather than @hl.scala("{{ component() }}"), but still not ideal.
//        @li
//          The one-template-per-file rule is still there, making abstractions clunky to define.
//        @li
//          They still require their own special build-system-integration, run-time compilation, caching, and other things, which a templating language really shouldn't need. @lnk("Scalate", "http://scalate.fusesource.org/index.html"), which has a runtime dependency on the entire Scala compiler, suffers from the same problem.
//        @li
//          The syntax still poses a problem for editors; both HTML editors and C#/Scala editors won't want to work with these templates, so you still end up with sub-par support or waiting for plugins.
//        @li
//          You still end up with weird @lnk("edge", "http://stackoverflow.com/questions/13973009/complex-pattern-matching-on-templace-using-scala-play") @lnk("cases", "http://stackoverflow.com/questions/12070625/compilation-error-of-play-framework-templates") due to the fact that you're squashing together two completely unrelated syntaxes.
//    @sect{XHP and Pyxl}
//
//      @p
//        @lnk("XHP", "https://github.com/facebook/xhp") and @lnk("Pyxl", "https://github.com/dropbox/pyxl") are HTML generation systems used at Facebook and Dropbox. In short, they allow you to:
//      @ul
//        @li
//          Embed sections of your HTML as literals within your PHP and Python code
//        @li
//          Reference them as objects (e.g. calling methods and modifying fields)
//        @li
//          Provide a way to interpolate values and combine them.
//      @p
//        The Pyxl homepage provides this example:
//
//      @hl.lang("python")
//        image_name = "bolton.png"
//        image = <img src="/static/images/{image_name}" />
//
//        text = "Michael Bolton"
//        block = <div>{image}{text}</div>
//
//        element_list = [image, text]
//        block2 = <div>{element_list}</div>
//
//      @p
//        Which shows how you can generate HTML directly in your python code, using your python variables. These libraries are basically the same thing, and have some nice properties:
//      @ul
//        @li
//          The one-template-per-file rule is gone! This encourages you to make more, smaller fragments and then compose them, which is great.
//        @li
//          They're no longer string-based, so you won't have problems with XSS or malformed output.
//        @li
//          The API is really simple; maybe a dozen different things you need to remember, and the rest is "just use Python/PHP". E.g. they don't need to load templates from the filesystem any more (with all the associated discovery/loading/caching logic) since it's all just in your code.
//        @li
//          The syntax is completely familiar too; apart from maybe one new rule (using @hl.scala("{...}") to interpolate values) the rest of your templates and logic are bog-standard HTML/Python/PHP.
//        @li
//          Abstraction is almost seamless; both systems allow you to define custom components and have them called via @hl.xml{<component arg="..." />}
//      @p
//        But they're not quite there:
//      @ul
//        @li
//          Although the syntax is familiar to you, it's not familiar to your editor, and probably will mess up your syntax highlighting (and other tooling) in your Python/PHP files.
//        @li
//          Defining custom components (e.g. in @lnk("Pyxl", "https://github.com/dropbox/pyxl#ui-modules")) is much more verbose/tedious than it needs to be. Most of the time, all you want is a function; very rarely do you want a fragment that is long lived and has mutable state, which is where classes/objects are really necessary.
//        @li
//          Even using custom components gets tedious; at some scale, everything you pass into a component will be a structured Python value rather than a string, and you end up with code like @hl.xml("""<component arg1="{value1}" arg2="{value2}" arg3="{value3}" arg4="{value4}" />"""). It's nice to have inbuilt/custom components behave uniformly, but you wonder what the XML syntax is really buying you other than forcing you to only use keyword-arguments and to wrap arguments in @hl.scala(""" "{...}" """).
//        @li
//          It's still XML! People spend @lnk("a lot", "https://github.com/visionmedia/jade") @lnk("of time", "http://haml.info/") trying to get XML out of their templates; it seems odd to spend just as much time trying to put it into your source code.
//
//    @sect{Scalatags}
//
//
//      @p
//        And that's why I created Scalatags:
//      @ul
//
//        @li
//          Structured and immune to malformed output/XSS.
//        @li
//          No more one-template-per-file rule; make small templates to your heart's content!
//
//        @li
//          Dead-simple API, which re-uses 100% of what you know about Scala's language and libraries.
//        @li
//          100% Scala syntax; no more bumping into weird edge cases with the parser.
//        @li
//          Syntax highlighting, error-highlighting, jump-to-definition, in-editor-documentation, and all the other nice IDE features out of the box. No more waiting for plugins!
//        @li
//          Inbuilt and custom tags are uniformly just function calls (e.g. @hl.scala{div("hello world")})
//        @li
//          Custom components are trivial to create (@hl.scala{def component(x: Int, y: Int) = ...}) and trivial to use (@hl.scala{component(value1, value2)}) because they're just functions.
//        @li
//          No dependencies! No need for SBT integration, filesystem loading, runtime compilation, caching, and all that jazz. You create a Scala object, call `.toString()`, and that's it!
//      @p
//        On top of fixing all the old problems, Scalatags targets some new ones:
//
//      @ul
//        @li
//          Typesafe-ish access to HTML tags, attributes and CSS classes and styles. No more weird bugs due to typos like @hl.scala{flaot: left} or @hl.xml{<dvi>}.
//        @li
//          Cross compiles to run on both JVM and Javascript via @lnk("ScalaJS", "https://github.com/scala-js/scala-js"), which is a property few other engines (e.g. @lnk("Mustache", "http://mustache.github.io/")) have.
//        @li
//          @lnk("Blazing fast", "#performance")
//      @p
//        Scalatags is still a work in progress, but I think I've hit most of the pain points I was feeling with the old systems, and hope to continually improve it over time. Pull requests are welcome!
//
//
//  @sect{Changelog}
//
//    @sect{0.5.2}
//      @ul
//        @li
//          Made `maxHeight`, `maxWidth`, `minHeight`, and `minWidth` into `PixelStyles` so passing in an integer does the right thing.
//
//    @sect{0.5.1}
//
//
//      @ul
//        @li
//          Add @code{transition} style
//        @li
//          Add extension method @hl.scala{dom.Element#applyTags(mods: Modifier*)} to easily apply Scalatags modifiers to existing elements.
//
//    @sect{0.5.0}
//      @ul
//        @li
//          First implementation of Scalatags @code{StyleSheet}s
//
//    @sect{0.4.6}
//      @ul
//        @li
//          Attribute is now "min-width" instead of "minWidth"
//        @li
//          Fixed typo in @code{borderRightStyle}
//        @li
//          Published for Scala.js 0.6.1
//
//    @sect{0.4.5}
//      @ul
//        @li
//          Fixed regression in definition of @hl.scala{JsDom.HtmlTag} introduced in 0.4.4
//
//    @sect{0.4.4}
//      @ul
//        @li
//          Updated to scala-js-dom 0.8.0
//        @li
//          Add missing SVG @code{spreadMethod}
//        @li
//
//          @hl.scala{()} is now a @hl.scala{Frag} rather than a @hl.scala{Modifer}, rendering to @hl.scala{""}
//        @li
//          Added a ton of missing attribtues
//
//    @sect{0.4.2}
//      @ul
//        @li
//
//          Added Javascript source maps that point to the Github sources.
//
//    @sect{0.4.1}
//      @ul
//        @li
//
//          Added basic @hl.scala{Namespace} support, to allow for proper rendering of SVG elements in the @hl.scala{JsDom} backend
//        @li
//          Replaced unmaintained/untested @hl.scala{SvgStyles} with a semi-tested @hl.scala{SvgAttrs}
//        @li
//          Added @code{example/} folder
//
//    @sect{0.4.0}
//      @ul
//        @li
//
//          Removed unused type param from @hl.scala{Frag}
//        @li
//          Changed @hl.scala{bindNode} from @hl.scala{Modifier[dom.Element]} to @hl.scala{Frag[dom.Element, dom.Node]}
//
//    @sect{0.3.9}
//      @ul
//        @li
//          Better error messages for missing implicits
//        @li
//          Added attribuets @code{method}, @code{role},@code{content}, @code{httpEquiv}, @code{onkeyup}, @code{onkeypress}
//        @li
//          Added implicit conversion from @hl.scala{Seq[Frag]} to @hl.scala{Frag}
//
//    @sect{0.3.8}
//      @ul
//        @li
//          Added @hl.scala{Frag} alias in @hl.scala{Bundle}, to match all the other aliases per-bundle
//
//    @sect{0.3.7}
//      @ul
//        @li
//          Added @hl.scala{implicits} object, for people who want to import all the implicit conversions/typeclasses without importing tags or other things
//
//    @sect{0.3.6}
//      @ul
//        @li
//          Added unit test and readme-section to document making custom-bundles, to allow customizable single-import syntax to bring all the things you want into scope.
//        @li
//          Deleted dead code in @hl.scala{Platform}
//        @li
//          Enforce lack of cycles between internal files
//        @li
//          Removed @hl.scala{StyleValue[T: Numeric]} and @hl.scala{AttrValue[T: Numeric]} in favor of @code{Byte}/@code{Short}/@code{Int}/etc. versions, to work around bug in type-inference in 2.10
//
//    @sect{0.3.5}
//      @ul
//        @li
//          Fixed a bug in @hl.scala{Text} backend that blew up when you had more than 8 attributes
//
//    @sect{0.3.4}
//      @ul
//        @li
//          Added a separate type parameter for @hl.scala{Frag.render}, distinct from the type of @hl.scala{TypedTag.render}, to more accurately type the API and allow the usage of @hl.scala{Frag}s on their own.
//
//  @sect{License}
//
//
//    The MIT License (MIT)
//
//    Copyright (c) 2013, Li Haoyi
//
//    Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
//
//    The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
//
//    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
          