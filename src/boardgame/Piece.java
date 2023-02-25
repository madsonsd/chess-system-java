package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //opcional Por padrão o Java já joga o valor nulo.
	}

	protected Board getBoard() {
		return board;
	}

}
