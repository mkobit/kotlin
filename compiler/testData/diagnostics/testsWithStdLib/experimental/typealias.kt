// FILE: api.kt

package api

@Experimental(ExperimentalLevel.WARNING, ExperimentalScope.SOURCE_ONLY)
@Target(AnnotationTarget.CLASS)
annotation class ExperimentalAPI

@ExperimentalAPI
class Foo

typealias Bar = <!EXPERIMENTAL_API_USAGE!>Foo<!>
