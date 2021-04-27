package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	/**
	 * hook methods
	 * Utilização de métodos abstratos
	 */
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] headquarters = possibleMoves();

		for (int row = 0; row < headquarters.length; row++) {
			for (int column = 0; column < headquarters.length; column++) {
				if (headquarters[row][column]) {
					return true;
				}
			}
		}
		
		return false;
	}
}
