
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.3*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.5*/(""" """),_display_(/*1.7*/main("Welcome")/*1.22*/ {_display_(Seq[Any](format.raw/*1.24*/(""" """),_display_(/*1.26*/defining(play.core.PlayVersion.current)/*1.65*/ { version =>_display_(Seq[Any](format.raw/*1.78*/("""
"""),format.raw/*2.1*/("""<div class="card">
    <div class="card-body">
        <div class="row">
            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <h5>Segitiga</h5>
                        <hr>
                        <form id="segitiga">
                            <div class="mb-3">
                                <label for="exampleInputEmail1" class="form-label">Alas</label>
                                <input name="alas" type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">Tinggi</label>
                                <input name="tinggi" type="number" class="form-control" id="exampleInputPassword1">
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputPassword1" class="form-label">Luas</label>
                                <input id="h_segitiga" readonly type="number" class="form-control" id="exampleInputPassword1">
                            </div>
                            <button type="submit" class="btn btn-primary">Hitung dan Simpan</button>
                        </form>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <h5>Lingkaran</h5>
                        <hr>
                        <form id="lingkaran">
                            <div class="mb-3">
                                <label for="exampleInputEmail1" class="form-label">Jari jari</label>
                                <input name="jari" type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputEmail1" class="form-label">Luas</label>
                                <input id="h_lingkaran" readonly type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                            </div>
                            <button type="submit" class="btn btn-primary">Hitung dan Simpan</button>
                        </form>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <h5>Persegi Panjang</h5>
                        <hr>
                        <form id="persegipanjang">
                            <div class="mb-3">
                                <label for="exampleInputEmail1" class="form-label">Panjang</label>
                                <input name="panjang" type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputEmail1" class="form-label">Lebar</label>
                                <input name="lebar" type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                            </div>
                            <div class="mb-3">
                                <label for="exampleInputEmail1" class="form-label">Luas</label>
                                <input id="h_pp" readonly type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                            </div>
                            <button type="submit" class="btn btn-primary">Hitung dan Simpan</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    $('#segitiga').on('submit', function(e) """),format.raw/*74.45*/("""{"""),format.raw/*74.46*/("""
        """),format.raw/*75.9*/("""e.preventDefault();
        $.ajax("""),format.raw/*76.16*/("""{"""),format.raw/*76.17*/("""
            """),format.raw/*77.13*/("""url: '/hitung_s',
            type: 'GET',
            data: $(this).serialize(),
            success: function(data) """),format.raw/*80.37*/("""{"""),format.raw/*80.38*/("""
                """),format.raw/*81.17*/("""$('#h_segitiga').val(data)
            """),format.raw/*82.13*/("""}"""),format.raw/*82.14*/("""
        """),format.raw/*83.9*/("""}"""),format.raw/*83.10*/(""");
    """),format.raw/*84.5*/("""}"""),format.raw/*84.6*/(""")

    $('#lingkaran').on('submit', function(e) """),format.raw/*86.46*/("""{"""),format.raw/*86.47*/("""
        """),format.raw/*87.9*/("""e.preventDefault();
        $.ajax("""),format.raw/*88.16*/("""{"""),format.raw/*88.17*/("""
            """),format.raw/*89.13*/("""url: '/hitung_l',
            type: 'GET',
            data: $(this).serialize(),
            success: function(data) """),format.raw/*92.37*/("""{"""),format.raw/*92.38*/("""
                """),format.raw/*93.17*/("""$('#h_lingkaran').val(data)
            """),format.raw/*94.13*/("""}"""),format.raw/*94.14*/("""
        """),format.raw/*95.9*/("""}"""),format.raw/*95.10*/(""");
    """),format.raw/*96.5*/("""}"""),format.raw/*96.6*/(""")

    $('#persegipanjang').on('submit', function(e) """),format.raw/*98.51*/("""{"""),format.raw/*98.52*/("""
        """),format.raw/*99.9*/("""e.preventDefault();
        $.ajax("""),format.raw/*100.16*/("""{"""),format.raw/*100.17*/("""
            """),format.raw/*101.13*/("""url: '/hitung_p',
            type: 'GET',
            data: $(this).serialize(),
            success: function(data) """),format.raw/*104.37*/("""{"""),format.raw/*104.38*/("""
                """),format.raw/*105.17*/("""$('#h_pp').val(data)
            """),format.raw/*106.13*/("""}"""),format.raw/*106.14*/("""
        """),format.raw/*107.9*/("""}"""),format.raw/*107.10*/(""");
    """),format.raw/*108.5*/("""}"""),format.raw/*108.6*/(""")
</script>
""")))}),format.raw/*110.2*/(""" """)))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-23T00:03:50.611
                  SOURCE: D:/scalaweb/app/views/index.scala.html
                  HASH: 38b5b71bc3a754c0d13056d85a86af77fa5f1964
                  MATRIX: 722->2|818->4|845->6|868->21|907->23|935->25|982->64|1032->77|1060->79|5179->4170|5208->4171|5245->4181|5309->4217|5338->4218|5380->4232|5529->4353|5558->4354|5604->4372|5672->4412|5701->4413|5738->4423|5767->4424|5802->4432|5830->4433|5908->4483|5937->4484|5974->4494|6038->4530|6067->4531|6109->4545|6258->4666|6287->4667|6333->4685|6402->4726|6431->4727|6468->4737|6497->4738|6532->4746|6560->4747|6643->4802|6672->4803|6709->4813|6774->4849|6804->4850|6847->4864|6997->4985|7027->4986|7074->5004|7137->5038|7167->5039|7205->5049|7235->5050|7271->5058|7300->5059|7346->5074
                  LINES: 21->1|26->1|26->1|26->1|26->1|26->1|26->1|26->1|27->2|99->74|99->74|100->75|101->76|101->76|102->77|105->80|105->80|106->81|107->82|107->82|108->83|108->83|109->84|109->84|111->86|111->86|112->87|113->88|113->88|114->89|117->92|117->92|118->93|119->94|119->94|120->95|120->95|121->96|121->96|123->98|123->98|124->99|125->100|125->100|126->101|129->104|129->104|130->105|131->106|131->106|132->107|132->107|133->108|133->108|135->110
                  -- GENERATED --
              */
          