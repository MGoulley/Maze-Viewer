public class Maze {
	private Cell[][] cells;
	private Cell start;
	private Cell end;

	private int sizeX;
	private int sizeY;

	public Maze(int sizeX, int sizeY) {
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.cells = new Cell[sizeX][sizeY];

		for (int i = 0; i < sizeX; i++) {
			for (int j = 0; j < sizeY; j++) {
				Cell cell = new Cell(4);
				this.cells[i][j] = cell;
			}
		}
	}
	
	public void openwall(int x1, int y1, int x2, int y2) {
		
	}
	
	public void toPrint() {
		for (int j = 0; j < sizeY; j++) {
			String[] lines = new String[] {"", "",""};
			for (int i = 0; i < sizeX; i++) {
				String[] sublines = this.cells[i][j].toPrint();
				lines[0] += sublines[0];
				lines[1] += sublines[1];
				lines[2] += sublines[2];
			}
			System.out.println(lines[0]);
			System.out.println(lines[1]);
			System.out.println(lines[2]);
		}
	}
}
