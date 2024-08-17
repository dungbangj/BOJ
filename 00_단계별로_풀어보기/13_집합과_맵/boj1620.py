def get_input() -> tuple[list[str], list[str]]:
	N, M = map(int, input().split())
	ref_mons: list[str] = [input().strip() for _ in range(N)]
	my_mons: list[str] = [input().strip() for _ in range(M)]
	return ref_mons, my_mons

def make_lookup_dict(ref_mons: list[str]) -> tuple[dict[int, str], dict[str, int]]:
	num_name_dict: dict[int, str] = {i + 1: name for i, name in enumerate(ref_mons)}
	name_num_dict: dict[str, int] = {name: i + 1 for i, name in enumerate(ref_mons)}
	return num_name_dict, name_num_dict

def get_result(my_mons: list[str], num_name_dict: dict[int, str], name_num_dict: dict[str, int]) -> None:
	for mon in my_mons:
		if mon.isdigit():
			print(num_name_dict[int(mon)])
		else:
			print(name_num_dict[mon])

def main() -> None:
	ref_mons, my_mons = get_input()
	num_name_dict, name_num_dict = make_lookup_dict(ref_mons)
	get_result(my_mons, num_name_dict, name_num_dict)

if __name__ == '__main__':
	main()
