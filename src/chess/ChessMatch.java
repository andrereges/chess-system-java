package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		intitialSetup();
	}

	public ChessPiece[][] getPieces() {

		ChessPiece[][] headquarters = new ChessPiece[board.getRows()][board.getColumns()];

		for (int row = 0; row < board.getRows(); row++) {
			for (int column = 0; column < board.getColumns(); column++) {
				headquarters[row][column] = (ChessPiece) board.piece(row, column);
			}
		}

		return headquarters;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column , row).toPosition());
	}
	
	private void intitialSetup() {
		placeNewPiece('a', 8, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
	}

}
