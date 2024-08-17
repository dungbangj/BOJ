def get_input() -> tuple[dict[int, int], list[int]]:
	input()
	ref_cards: list[int] = list(map(int, input().split(" ")))
	ref_cards_dict: dict[int, int] = make_dict(ref_cards)
	input()
	my_cards: list[int] = list(map(int, input().split(" ")))
	return ref_cards_dict, my_cards

def make_dict(ref_cards: list[int]) -> dict[int, int]:
	ref_cards_dict: dict[int, int] = {}

	for card in ref_cards:
		if card in ref_cards_dict:
			ref_cards_dict[card] += 1
		else:
			ref_cards_dict[card] = 1
	return ref_cards_dict

def print_output(ref_cards_dict: dict[int, int], my_cards: list[int]) -> None:
	for card in my_cards:
		if card in ref_cards_dict:
			print(ref_cards_dict[card], end = " ")
		else:
			print(0, end = " ")

def main() -> None:
	ref_cards_dict, my_cards = get_input()
	print_output(ref_cards_dict, my_cards)

if __name__ == '__main__':
	main()