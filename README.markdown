A [Giter8][g8] template for Spark 2 at OCLC
About This Template
----------------
This is a giter8 (g8) sbt template that can be used to generate a starter
SBT Spark2 project.  I find that the hardest thing about writing lots of
code is the first step: creating a build.  So, to speed things up, you can
use this template to quickly get a build shell created, and then you can 
jump right in to the good stuff.

To use it, simply run the sbt *new* command in a directory where you want the project template expanded.  It will ask you for some values that will customise the resulting project.
```bash
$ cd ${my work area}
$ sbt new hjamieson/oclc-spark2-seed.g8
```
It will prompt you for values that you can override if desired:
```
name [oclc-spark-project]: kigaraba-spark
about [A Spark2 Project For OCLC.org]: A job to find the best food in Columbus
package [org.oclc.spark.project1]: org.kigaraba
organization [org.oclc]: org.kigaraba

Template applied in /Users/hughj/Development/junk/./kigaraba-spark
```
Once complete, you can cd in the newly-created project folder and run sbt commands.  Your development can begin!

Running Your Code
-----------------
Spark projects are a little odd in that you typically mark spark jars PROVIDED.  This creates a problem
when you try to run your shiny new spark thing using SBT run.  
I added a little hack I found on the internet that puts the PROVIDED jars back on the run classpath so
SBT runMain will work (for local jobs).  Feel free to rip this out; its well bracketed.  It will not 
change your assembly in anyway.

Template license
----------------
Written in 2018 by Hugh Jamieson jamiesoh@oclc.org
[other author/contributor lines as appropriate]

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

