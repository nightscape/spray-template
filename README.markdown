## _spray_ Template Project (SBT 0.10.x)

1. Git-clone this repository. Alternatively, download and extract a [tarball](http://github.com/spray/spray-template/tarball/master) or [zip](http://github.com/sirthias/spray-template/zipball/master).

        $ git clone git://github.com/spray/spray-template.git my-project

2. Change directory into your clone:

        $ cd my-project

3. Launch [SBT](http://code.google.com/p/simple-build-tool) (SBT 0.10.1, if you'd like to use SBT 0.7.7 check out the `develop` branch of this repository):

        $ sbt

4. Compile everything and run the tests:

        > test

5. Start Jetty:

        > jetty-run

6. Browse to http://localhost:8080/

7. Learn more at http://www.spray.cc/

8. Start hacking on `src/main/scala/com/example/HelloService.scala`

