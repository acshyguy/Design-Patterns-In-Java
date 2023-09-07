package com.interswitch.designpattern.commandPattern;

public class ActionOpen implements ActionListenerCommand{
	
	private Document doc;
	 
    public ActionOpen(Document doc) {
        this.doc = doc;
    }
    @Override
    public void execute() {
        doc.open();
    }

}
