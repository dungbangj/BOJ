import * as fs from 'fs';

const input: string = fs.readFileSync('/dev/stdin', 'utf-8');
const inputLine : number[] = input.split("\n").map(line => parseInt(line));
const testCaseNum: number = inputLine[0];
let result : string = "";
for (let i = 1; i <= testCaseNum; i++) {
    const inputNum: number = inputLine[i];
    const absNum = Math.abs(inputNum);
    if (absNum % 2 == 0)
        result += inputNum + " is even\n";
    else
        result += inputNum + " is odd\n";
}
console.log(result);