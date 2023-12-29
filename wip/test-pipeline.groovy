node {
	git 'https://github.com/khulnasoft/janky-groovy.git'
	def a = load('wip/test-load.groovy')
	echo(a.test())
	echo(a.b)
}
