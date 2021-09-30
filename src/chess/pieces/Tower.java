package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Colour;

public class Tower extends ChessPiece{

	public Tower(Board board, Colour colour) {
		super(board, colour);
		
	}

	@Override
	public String toString() {
		return "T";
	}

	
}
