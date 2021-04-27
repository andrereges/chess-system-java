package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
	
	protected final String name = "K";
	
	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] headquarters = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		return headquarters;
	}

}
