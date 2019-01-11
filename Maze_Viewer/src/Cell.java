public class Cell {
	private boolean[] connected; // list start from top->right->bot->left clock cycle style

	private boolean visited = false;
	private boolean isStart = false;
	private boolean isEnd = false;

	public Cell(int nbNeighbours) {
		connected = new boolean[nbNeighbours];
	}

	public Cell(int nbNeighbours, boolean start, boolean end) {
		this(nbNeighbours);
		this.isStart = start;
		this.isEnd = end;
	}

	public void connectTo(int i) {
		this.connected[i] = true;
	}

	public String[] toPrint() {
		String l1 = "";
		String l2 = "";
		String l3 = "";

		if (connected[0] == true) {
			l1 += "+ +";
		} else {
			l1 += "+-+";
		}

		if (connected[3] == true) {
			l2 += " ";
		} else {
			l2 += "|";
		}

		if (isStart) {
			l2 += "s";
		} else if (isEnd) {
			l2 += "e";
		}else if (visited) {
			l2 += "v";
		} else {
			l2 += " ";
		}

		if (connected[1] == true) {
			l2 += " ";
		} else {
			l2 += "|";
		}

		if (connected[2] == true) {
			l3 += "+ +";
		} else {
			l3 += "+-+";
		}
		
		return new String[] { l1, l2, l3 };
	}
}
