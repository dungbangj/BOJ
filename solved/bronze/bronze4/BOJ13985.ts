import * as fs from 'fs';

const input = fs.readFileSync('/dev/stdin', 'utf-8');

const inputs: number[] = input.split(' ').filter(x => 0 <= parseInt(x) && parseInt(x) <= 9).map(Number);

if (inputs[0] + inputs[1] === inputs[2]) {
	console.log("YES");
} else {
	console.log("NO")
}