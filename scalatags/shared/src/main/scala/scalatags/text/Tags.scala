package scalatags
package text
import acyclic.file
trait Tags extends generic.Tags[Builder, String, String]{
  // Root Element
  lazy val html = "html".tag[String]
  // Document Metadata
  lazy val head = "head".tag[String]
  lazy val base = "base".voidTag[String]
  lazy val link = "link".voidTag[String]
  lazy val meta = "meta".voidTag[String]
  // Scripting
  lazy val script = "script".tag[String]
  // Sections
  lazy val body = "body".tag[String]
  lazy val h1 = "h1".tag[String]
  lazy val h2 = "h2".tag[String]
  lazy val h3 = "h3".tag[String]
  lazy val h4 = "h4".tag[String]
  lazy val h5 = "h5".tag[String]
  lazy val h6 = "h6".tag[String]
  lazy val header = "header".tag[String]
  lazy val footer = "footer".tag[String]
  // Grouping content
  lazy val p = "p".tag[String]
  lazy val hr = "hr".voidTag[String]
  lazy val pre = "pre".tag[String]
  lazy val blockquote = "blockquote".tag[String]
  lazy val ol = "ol".tag[String]
  lazy val ul = "ul".tag[String]
  lazy val li = "li".tag[String]
  lazy val dl = "dl".tag[String]
  lazy val dt = "dt".tag[String]
  lazy val dd = "dd".tag[String]
  lazy val figure = "figure".tag[String]
  lazy val figcaption = "figcaption".tag[String]
  lazy val div = "div".tag[String]
  // Text-level semantics
  lazy val a = "a".tag[String]
  lazy val em = "em".tag[String]
  lazy val strong = "strong".tag[String]
  lazy val small = "small".tag[String]
  lazy val s = "s".tag[String]
  lazy val cite = "cite".tag[String]
  lazy val code = "code".tag[String]
  lazy val sub = "sub".tag[String]
  lazy val sup = "sup".tag[String]
  lazy val i = "i".tag[String]
  lazy val b = "b".tag[String]
  lazy val u = "u".tag[String]
  lazy val span = "span".tag[String]
  lazy val br = "br".voidTag[String]
  lazy val wbr = "wbr".voidTag[String]
  // Edits
  lazy val ins = "ins".tag[String]
  lazy val del = "del".tag[String]
  // Embedded content
  lazy val img = "img".voidTag[String]
  lazy val iframe = "iframe".tag[String]
  lazy val embed = "embed".voidTag[String]
  lazy val `object` = "object".tag[String]
  lazy val param = "param".voidTag[String]
  lazy val video = "video".tag[String]
  lazy val audio = "audio".tag[String]
  lazy val source = "source".voidTag[String]
  lazy val track = "track".voidTag[String]
  lazy val canvas = "canvas".tag[String]
  lazy val map = "map".tag[String]
  lazy val area = "area".voidTag[String]
  // Tabular data
  lazy val table = "table".tag[String]
  lazy val caption = "caption".tag[String]
  lazy val colgroup = "colgroup".tag[String]
  lazy val col = "col".voidTag[String]
  lazy val tbody = "tbody".tag[String]
  lazy val thead = "thead".tag[String]
  lazy val tfoot = "tfoot".tag[String]
  lazy val tr = "tr".tag[String]
  lazy val td = "td".tag[String]
  lazy val th = "th".tag[String]
  // Forms
  lazy val form = "form".tag[String]
  lazy val fieldset = "fieldset".tag[String]
  lazy val legend = "legend".tag[String]
  lazy val label = "label".tag[String]
  lazy val input = "input".voidTag[String]
  lazy val button = "button".tag[String]
  lazy val select = "select".tag[String]
  lazy val datalist = "datalist".tag[String]
  lazy val optgroup = "optgroup".tag[String]
  lazy val option = "option".tag[String]
  lazy val textarea = "textarea".tag[String]
}
