import * as fs from 'fs';

const input: string = fs.readFileSync('/dev/stdin', 'utf-8').trim();

const inputLines: string[] = input.split('\n');

const T: number = parseInt(inputLines[0]);

const ABCDE: number[] = inputLines[1].split(' ').map(Number);

let count: number = 0;
for (let i = 0; i < ABCDE.length; i++)
	if (T === ABCDE[i])
		count++;

console.log(count);