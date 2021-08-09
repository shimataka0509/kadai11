
class Radio extends Seihin {

	private int radioSerialNumber;
	public void numberring() {
		radioSerialNumber = Counter.getRadioNumber();
	}

	@Override
	public void print() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("このラジオに関する情報:");
		System.out.println(" 製造番号:" + radioSerialNumber);

	}

}
