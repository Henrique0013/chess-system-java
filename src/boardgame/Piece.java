package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null; // não haveria a necessidade desse comando. Quando não tem valor atribuido,
							// o Java já define como null
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();

	/*
	 * Exemplo de um método concreto que faz a chamada de um método abstrato. É
	 * chamado de hook methods. Método que faz um gancho com uma subclasse.
	 */
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}

}
