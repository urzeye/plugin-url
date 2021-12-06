# plugin-url

### A plugin for the [ja-netfilter](https://github.com/pengzhile/ja-netfilter), it can block http requests.

#### Use the `mvn clean package` command to compile and use `url-vX.X.X-jar-with-dependencies.jar` file!

## Config file

```
[URL]
EQUAL,https://someurl

# EQUAL     Use `equals` to compare
# KEYWORD   Use `contains` to compare
# PREFIX    Use `startsWith` to compare
# SUFFIX    Use `endsWith` to compare
# REGEXP    Use regular expressions to match
```
