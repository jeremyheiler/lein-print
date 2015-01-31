# lein-print

A Leiningen plugin that will print stuff in the project map.

```
[lein-print "0.1.0"]
```

## Usage

With out any arguments, the entire project map is printed. Each
argument is a keyword that represents a potential key in the project
map. Multiple keywords will return the nested value.

```
$ lein print :version
"0.1.0"
$ lein print :license :name
"Eclipse Public License"
```

## License

Copyright © 2015 Jeremy Heiler

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
