import * as fs from 'fs';
import { parse } from 'path';

const input : string = fs.readFileSync('/dev/stdin', 'utf-8').trim();
const inputLines : string[] = input.split("\n");
const N : number = parseInt(inputLines[0]);
let result : string = "";

let strategyLimit = 35 * 0.3;
let itLimit = 25 * 0.3;
let skillLimit = 40 * 0.3;

for (let i = 1; i <= N; i++) {
    const oneLine : string[] = inputLines[i].split(" ");
    const sum : number = parsing(oneLine);
    if (sum >= 55 && check(oneLine))
        result += oneLine[0] + " " + sum + " PASS\n";
    else
        result += oneLine[0] + " " + sum + " FAIL\n";
}

console.log(result);

function parsing(oneLine : string[]) {
    return parseInt(oneLine[1]) + parseInt(oneLine[2]) + parseInt(oneLine[3]);
}

function check(oneLine : string[]) {
    if (parseInt(oneLine[1]) >= strategyLimit && parseInt(oneLine[2]) >= itLimit && parseInt(oneLine[3]) >= skillLimit)
        return true;
    return false;
}