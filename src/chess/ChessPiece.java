package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	
	protected String name;
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;		
	}
	
	public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}

}
