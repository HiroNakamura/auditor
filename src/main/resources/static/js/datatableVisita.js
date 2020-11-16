$(document).ready( function () {
         var table = $('#tableVisitas').DataTable({
                        "sAjaxSource": "/apirest/visitantes",
                        "sAjaxDataProp": "",
                        "order": [[ 0, "asc" ]],
                        "aoColumns": [
                      { "mData": "comentario"},
                      { "mData": "fecha" },
                        ]
         });

         $('#tableVisitas tbody').on('click','tr',function(){
          var data = table.row(this).data()
             $("#info").html('Dato: '+data[0]);
         });
});