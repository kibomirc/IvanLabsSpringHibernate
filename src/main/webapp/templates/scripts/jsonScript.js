

$(document).ready( function () {
    var table = $('#example').DataTable()( {
        buttons: [
            'copy', 'excel', 'pdf'
        ]
    } );
    table.buttons().container()
        .appendTo( $('.col-sm-6:eq(0)', table.table().container() ) );
} );