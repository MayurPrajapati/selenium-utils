			List<Long> indexes = (List<Long>) Global.jse.executeScript("return getIndexOfIframesWithXpath(\""+xpath+"\")");
			Global.window.switchToDefaultContent();
			for (int i = 0; i < indexes.size(); i++) {
				Long index = indexes.get(i);
				Global.window.switchToFrameUsingXpath("(//*[name()='frame' or name()='iframe' or local-name()='frame' or local-name()='iframe'])[" + index + "]");
			}
			Global.button.click(xpath, "Button");
