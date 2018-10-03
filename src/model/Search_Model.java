package model;

public class Search_Model extends SmartSerializable {
	
	private static final long serialVersionUID = 1L;
	
	private String inputText, outputText;

	public Search_Model() {
	}
	
	public Search_Model(String inputText, String outputText) {
		this.inputText = inputText;
		this.outputText = outputText;
	}

	public String getInputText() {
		return inputText;
	}

	public void setInputText(String inputText) {
		this.inputText = inputText;
	}

	public String getOutputText() {
		return outputText;
	}

	public void setOutputText(String outputText) {
		this.outputText = outputText;
	}
	
}
