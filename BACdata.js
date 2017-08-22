 $.ajax({
        url: "source1.csv",
        dataType: 'text',
        cache: false
 }).done(function(csvAsString){
        csvAsArray=csvAsString.csvToArray();
 });