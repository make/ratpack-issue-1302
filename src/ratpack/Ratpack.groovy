import ratpack.groovy.template.MarkupTemplateModule

import static ratpack.groovy.Groovy.groovyMarkupTemplate
import static ratpack.groovy.Groovy.ratpack
import static ratpack.jackson.Jackson.json
import static ratpack.rx.RxRatpack.promiseSingle

ratpack {
    bindings {
        module MarkupTemplateModule
    }

    handlers {
        get {
            promiseSingle(
                    rx.Observable.from(1..50).forkEach().toList().map {
                        assert !it.contains(null)
                        it
                    }
            ).then {
                render(json(it))
            }
        }

        files { dir "public" }
    }
}
