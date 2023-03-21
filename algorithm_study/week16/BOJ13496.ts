import * as fs from 'fs';

const input = fs.readFileSync('/dev/stdin', 'utf-8');

const inputLines: string[] = input.split('\n');
let index: number = 0;
const K: number = parseInt(inputLines[index++]);

let result: string = "";

for (let i = 0; i < K; i++) {
	let sum: number = 0;
	const threeInputs: number[] = inputLines[index++].split(' ').map(Number);
	const numberOfShips: number = threeInputs[0];
	const movePerDay: number = threeInputs[1];
	const daysLeft: number = threeInputs[2];

	for (let j = 0; j < numberOfShips; j++) {
		const oneShipInput: number[] = inputLines[index++].split(' ').map(Number);
		const distanceFromVan: number = oneShipInput[0];
		const shipLoad: number = oneShipInput[1];

		if(Math.ceil(distanceFromVan / movePerDay) <= daysLeft) {
			sum += shipLoad;
		}
	}
	result += "Data Set " + (i + 1) + ":\n" + sum + "\n\n";
}

console.log(result);