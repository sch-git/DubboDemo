

@RabbitListener bindings:绑定队列<br/>
<blockquote>
@QueueBinding 
  <blockquote>
    value:绑定队列的名称<br/>
    exchange:配置交换器<br/>
    @Queue 
    <blockquote>
      value:配置队列名称<br/>
      [autoDelete:是否是一个可删除的临时队列]<br/>
    </blockquote>
    @Exchange 
    <blockquote>
      value:配置交换器名称<br/>
      type:具体的交换器类型<br/>\
    </blockquote>
  </blockquote>
</blockquote>
