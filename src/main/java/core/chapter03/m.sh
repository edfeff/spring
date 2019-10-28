#!/usr/bin/env bash
echo "sh ./m.sh <start> <end>"
#
i=$1
while (( $i <= $2 ))
do
	echo _$i
	mkdir _$i
	cd ./_$i
	touch readme.md
	cd ../
	let "i++"
done
