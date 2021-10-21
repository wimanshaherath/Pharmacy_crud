$("#item-form").submit((event)=>{
    event.preventDefault()
    let post_url = $(this).attr("action")
    let method=$(this).attr("method")
    let form_data=$(this).serialize()
    $.ajax(
        {
            url: post_url,
            method: method,
            type: 'json',
            data: form_data,
            success:(response)=>{
                alert(response)
            }
        }
    )
})