> Note: this will only work for same-domain frames, as browser JS APIs has access of some-domain iframes
> 
> This will not work for multi-domain frames, e.g. can not access Google Ads frame

Switch to iframe which has given xpath as child element.

Get final iframe route as `indexes` using `getIndexOfIframesWithXpath()` (JS) & switch to that iframe using `indexes` route

```java
// "getIndexOfIframesWithXpath()" returns list of indexes of iframes, we can say a route to reach to our expected iframe
List<Long> indexes = (List<Long>) jse.executeScript("return getIndexOfIframesWithXpath(\""+xpath+"\")");
// ...
// code to switch to default content
// ...

// using this for loop switch to iframes one by one using "indexes"
for (int i = 0; i < indexes.size(); i++) {
	Long index = indexes.get(i);
  // ...
  // code to switch to iframe using universal xpath
  // "(//*[name()='frame' or name()='iframe' or local-name()='frame' or local-name()='iframe'])[" + index + "]"
  // ...
}
// here you have access to that element
```
