package chess;

import boardgame.Board;
import boardgame.Position;
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
	
	private void intitialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(0, 0));
		board.placePiece(new Rook(board, Color.WHITE), new Position(0, 7));
		board.placePiece(new King(board, Color.WHITE), new Position(0, 3));
		
		board.placePiece(new Rook(board, Color.BLACK), new Position(7, 0));
		board.placePiece(new Rook(board, Color.BLACK), new Position(7, 7));
		board.placePiece(new King(board, Color.BLACK), new Position(7, 3));
	}

}
