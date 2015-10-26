
          package scalatex
          object Main extends scalatex.site.Main(
            url = "https://github.com/lihaoyi/scalatags/tree/master",
            wd = ammonite.ops.cwd,
            output = ammonite.ops.cwd/ammonite.ops.RelPath("target/site"),
            extraAutoResources = Seq("Autocomplete.png","ErrorHighlighting.png","InlineDocs.png").map(ammonite.ops.root/ammonite.ops.RelPath(_)),
            scalatex.Readme()
          )
        