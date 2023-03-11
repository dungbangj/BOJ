import * as fs from 'fs';

const input: string = fs.readFileSync('/dev/stdin', 'utf-8').trim();

const inputs: number[][] = input.split('\n').slice().map(line => line.split(' ').slice().map(Number));

let i: number = 0;
let result: string = "";
let sum: number;

while (true) {
    sum = 0;
    if (inputs[i][0] === 0)
        break;
    result += "Case " + (i + 1) + ": "
    if (inputs[i].length % 2 === 0)
        sum = inputs[i][Math.floor(inputs[i][0] / 2) + 1];
    else
        sum = (inputs[i][Math.floor(inputs[i][0] / 2)] + inputs[i][Math.floor(inputs[i][0] / 2) + 1]) / 2;
    result += sum.toFixed(1) + "\n";
    i++;
}
console.log(result);
