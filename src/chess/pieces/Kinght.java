package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Kinght extends ChessPiece{

	public Kinght(Board board, Color color) {
		super(board, color);
		
	}

	@Override
	public boolean[][] possibleMoves() {
		
		return null;
	}
	
	@Override
	public String toString() {
		return "K";
	}

}
