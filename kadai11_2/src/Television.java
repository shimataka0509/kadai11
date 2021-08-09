
class Television extends Seihin {

	private int tvSerialNumber;
	private String date;
	public void numberring() {
		tvSerialNumber = Counter.getTvNumber();
	}
	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public void print() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("このテレビに関する情報:");
		System.out.println(" 製造番号:" + tvSerialNumber);
		System.out.println(" 製造年月日:" + date);

	}

}
