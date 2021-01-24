
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object clientpertama extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.3*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.5*/(""" """),_display_(/*1.7*/main("Welcome")/*1.22*/ {_display_(Seq[Any](format.raw/*1.24*/(""" """),_display_(/*1.26*/defining(play.core.PlayVersion.current)/*1.65*/ { version =>_display_(Seq[Any](format.raw/*1.78*/("""
"""),format.raw/*2.1*/("""<div class="card">
    <div class="row">
        <div class="col-md-6">
            <div class="card">
                <div class="card-body">
                    <h5>Latihan 1 (Pembalik String)</h5>
                    <div class="response"></div>
                    <hr>
                    <form id="clientku">
                        <div class="form-group">
                            <label for="exampleInputEmail1">Masukkan String</label>
                            <input type="text" class="form-control" name="stringku" aria-describedby="emailHelp">
                            <small id="emailHelp" class="form-text text-muted">String diatas akan dibalik oleh server</small>
                        </div>

                        <button type="submit" class="btn btn-primary">Kirim</button>
                    </form>
                </div>
            </div>
        </div>

        <div class="col-md-6">
            <div class="card">
                <div class="card-body">
                    <h5>Latihan 2 (Pembagi List)</h5>
                    <div class="response2"></div>
                    <hr>
                    <form id="clientku2">
                        <div class="form-group">
                            <label for="exampleInputEmail1">Masukkan String</label>
                            <textarea type="text" class="form-control" name="stringku" aria-describedby="emailHelp"></textarea>
                            <small id="emailHelp" class="form-text text-muted">Pisahkan setiap kata dengan SPASI</small>
                        </div>

                        <button type="submit" class="btn btn-primary">Kirim</button>
                    </form>
                </div>
            </div>
        </div>

    </div>
</div>
<script>
    $('#clientku').on('submit', function(e) """),format.raw/*45.45*/("""{"""),format.raw/*45.46*/("""
        """),format.raw/*46.9*/("""e.preventDefault();
        $.ajax("""),format.raw/*47.16*/("""{"""),format.raw/*47.17*/("""
            """),format.raw/*48.13*/("""url: '/minta',
            type: 'GET',
            data: $(this).serialize(),
            success: function(data) """),format.raw/*51.37*/("""{"""),format.raw/*51.38*/("""
                """),format.raw/*52.17*/("""$('.response').html(data)
            """),format.raw/*53.13*/("""}"""),format.raw/*53.14*/("""
        """),format.raw/*54.9*/("""}"""),format.raw/*54.10*/(""");
    """),format.raw/*55.5*/("""}"""),format.raw/*55.6*/(""")

    $('#clientku2').on('submit', function(e) """),format.raw/*57.46*/("""{"""),format.raw/*57.47*/("""
        """),format.raw/*58.9*/("""e.preventDefault();
        $.ajax("""),format.raw/*59.16*/("""{"""),format.raw/*59.17*/("""
            """),format.raw/*60.13*/("""url: '/minta2',
            type: 'GET',
            data: $(this).serialize(),
            success: function(data) """),format.raw/*63.37*/("""{"""),format.raw/*63.38*/("""
                """),format.raw/*64.17*/("""$('.response2').html(data)
            """),format.raw/*65.13*/("""}"""),format.raw/*65.14*/("""
        """),format.raw/*66.9*/("""}"""),format.raw/*66.10*/(""");
    """),format.raw/*67.5*/("""}"""),format.raw/*67.6*/(""")
</script>
""")))}),format.raw/*69.2*/(""" """)))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-01-24T13:51:20.263
                  SOURCE: D:/Utama/Semester 7/Scala/Ujian Socket/scala_soket/app/views/clientpertama.scala.html
                  HASH: 5b2a300b505c8d3d402f0d5cce10f7871366f4a9
                  MATRIX: 730->2|826->4|853->6|876->21|915->23|943->25|990->64|1040->77|1068->79|2959->1942|2988->1943|3025->1953|3089->1989|3118->1990|3160->2004|3306->2122|3335->2123|3381->2141|3448->2180|3477->2181|3514->2191|3543->2192|3578->2200|3606->2201|3684->2251|3713->2252|3750->2262|3814->2298|3843->2299|3885->2313|4032->2432|4061->2433|4107->2451|4175->2491|4204->2492|4241->2502|4270->2503|4305->2511|4333->2512|4378->2527
                  LINES: 21->1|26->1|26->1|26->1|26->1|26->1|26->1|26->1|27->2|70->45|70->45|71->46|72->47|72->47|73->48|76->51|76->51|77->52|78->53|78->53|79->54|79->54|80->55|80->55|82->57|82->57|83->58|84->59|84->59|85->60|88->63|88->63|89->64|90->65|90->65|91->66|91->66|92->67|92->67|94->69
                  -- GENERATED --
              */
          