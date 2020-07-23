package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null; // n�o haveria a necessidade desse comando. Quando n�o tem valor atribuido,
							// o Java j� define como null
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();

	/*
	 * Exemplo de um m�todo concreto que faz a chamada de um m�todo abstrato. �
	 * chamado de hook methods. M�todo que faz um gancho com uma subclasse.
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
