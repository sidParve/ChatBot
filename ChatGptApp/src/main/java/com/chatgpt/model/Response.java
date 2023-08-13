package com.chatgpt.model;

import java.util.List;

public class Response {
	private List<Choice> choices;

	public List<Choice> getChoices() {
		return choices;
	}

	public void setChoices(List<Choice> choices) {
		this.choices = choices;
	}

	public static class Choice {

		private int index;
		private Massage massage;

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

		public Massage getMessage() {
			return massage;
		}

		public void setMessage(Massage massage) {
			this.massage = massage;
		}

		public Choice(int index, Massage massage) {
			super();
			this.index = index;
			this.massage = massage;
		}

		public Choice() {
			super();
		}

	}

}
