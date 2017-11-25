<?php
$_fp = fopen("php://stdin", "r");

function sparseArrays($_fp) {

  // Variable Declarations
  $stringCollection = []; // array that stores strings
  $queryCollection  = []; // array that stores queries
  $matchQueries     = []; // record matches 
    
  // Store the strings
  $n = trim(fgets($_fp));
  for ($i = 0; $i < $n; $i++) {
    $string = trim(fgets($_fp));
    $stringCollection[] = $string;
  }
  // Store the queries
  $q = trim(fgets($_fp));
  for ($i = 0; $i < $q; $i++) {
    $string = trim(fgets($_fp));
    $queryCollection[] = $string;
  } 
  // Find the matches
  for ($i = 0; $i < $q; $i++) { 
    for ($j = 0; $j < $n; $j++) {
      if ($j == 0) {
        $matchQueries[$i] = 0;
      }
      if  ($queryCollection[$i] == $stringCollection[$j]) {
        $matchQueries[$i]++; 
      }
    }
  }    
  // Print the matches
  for ($i = 0; $i < count($matchQueries); $i++) {
    echo $matchQueries[$i];
    echo "\n";
  }
}
sparseArrays($_fp);
?>